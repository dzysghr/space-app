package sk.kasper.space.api.entity

import sk.kasper.space.database.entity.LaunchSiteEntity

data class RemoteLaunchSite(val id: Long,
                            val siteName: String,
                            val padName: String?,
                            val infoURL: String?,
                            val latitude: Double,
                            val longitude: Double) {
    
    fun toLaunchSiteEntity() = LaunchSiteEntity(id, siteName, padName, infoURL, latitude, longitude)
}