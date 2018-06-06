package realmmigration.test.theyavikteam.com.realmmigration

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Person(@PrimaryKey var identityId: String = "", var name: String= "", var surname: String = "") : RealmObject()