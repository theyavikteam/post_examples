package realmmigration.test.theyavikteam.com.realmmigration

import io.realm.DynamicRealm
import io.realm.RealmMigration

class PersonAgeMigration : RealmMigration {
    override fun migrate(realm: DynamicRealm, oldVersion: Long, newVersion: Long) {
        if (DatabaseConstants.FIRST_VERSION == oldVersion) {
            realm.schema.get(Person::class.java.simpleName)?.addField("age", Int::class.java)
            oldVersion.inc()
        }
    }
}