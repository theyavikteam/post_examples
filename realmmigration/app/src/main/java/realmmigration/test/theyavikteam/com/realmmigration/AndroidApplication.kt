package realmmigration.test.theyavikteam.com.realmmigration

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class AndroidApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        Realm.setDefaultConfiguration(RealmConfiguration.Builder()
                .name(DatabaseConstants.NAME)
                .schemaVersion(DatabaseConstants.THIRD_VERSION)
                .migration(DogAdditionMigration())
                .build())
    }

}