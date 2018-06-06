package realmmigration.test.theyavikteam.com.realmmigration

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

data class Person(@PrimaryKey val identityId: String, val name: String, val surname: String) : RealmObject()