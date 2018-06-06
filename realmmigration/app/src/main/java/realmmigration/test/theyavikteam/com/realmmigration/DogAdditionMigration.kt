package realmmigration.test.theyavikteam.com.realmmigration

import io.realm.DynamicRealm
import io.realm.FieldAttribute
import io.realm.RealmMigration

class DogAdditionMigration: RealmMigration{
    override fun migrate(realm: DynamicRealm, oldVersion: Long, newVersion: Long) {
        val realmSchema = realm.schema
        if (DatabaseConstants.FIRST_VERSION == oldVersion) {
            realmSchema.get(Person::class.java.simpleName)?.addField("age", Int::class.java)
            oldVersion.inc()
        }
        if (DatabaseConstants.SECOND_VERSION == oldVersion){
            realmSchema.create(Dog::class.java.simpleName).addField("name", String::class.java, FieldAttribute.PRIMARY_KEY, FieldAttribute.REQUIRED)
            oldVersion.inc()
        }
    }
}