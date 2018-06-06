package realmmigration.test.theyavikteam.com.realmmigration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db = Realm.getDefaultInstance()
        db.beginTransaction()
        db.copyToRealmOrUpdate(Person("00000001R", "Javi", "Rodríguez"))
        db.commitTransaction()
        val firstPerson = db.where(Person::class.java).findFirst()
        label.text = firstPerson?.let {
            it.surname + ", " + it.name + " - " + it.identityId
        }
    }

}
