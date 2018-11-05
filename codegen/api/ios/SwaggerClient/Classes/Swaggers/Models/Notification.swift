//
// Notification.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



open class Notification: Codable {

    public var alert: XAny?
    public var badge: Double?
    public var category: String?
    public var collapseKey: String?
    public var contentAvailable: Bool?
    public var created: Date?
    public var delayWhileIdle: Bool?
    public var deviceToken: String
    public var deviceType: String
    public var expirationInterval: Double?
    public var expirationTime: Date?
    public var modified: Date?
    public var scheduledTime: Date?
    public var sound: String?
    public var status: String?
    public var urlArgs: [String]?
    public var id: Double?


    
    public init(alert: XAny? = nil, badge: Double? = nil, category: String? = nil, collapseKey: String? = nil, contentAvailable: Bool? = nil, created: Date? = nil, delayWhileIdle: Bool? = nil, deviceToken: String, deviceType: String, expirationInterval: Double? = nil, expirationTime: Date? = nil, modified: Date? = nil, scheduledTime: Date? = nil, sound: String? = nil, status: String? = nil, urlArgs: [String]? = nil, id: Double? = nil) {
        self.alert = alert
        self.badge = badge
        self.category = category
        self.collapseKey = collapseKey
        self.contentAvailable = contentAvailable
        self.created = created
        self.delayWhileIdle = delayWhileIdle
        self.deviceToken = deviceToken
        self.deviceType = deviceType
        self.expirationInterval = expirationInterval
        self.expirationTime = expirationTime
        self.modified = modified
        self.scheduledTime = scheduledTime
        self.sound = sound
        self.status = status
        self.urlArgs = urlArgs
        self.id = id
    }
    

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(alert, forKey: "alert")
        try container.encodeIfPresent(badge, forKey: "badge")
        try container.encodeIfPresent(category, forKey: "category")
        try container.encodeIfPresent(collapseKey, forKey: "collapseKey")
        try container.encodeIfPresent(contentAvailable, forKey: "contentAvailable")
        try container.encodeIfPresent(created, forKey: "created")
        try container.encodeIfPresent(delayWhileIdle, forKey: "delayWhileIdle")
        try container.encode(deviceToken, forKey: "deviceToken")
        try container.encode(deviceType, forKey: "deviceType")
        try container.encodeIfPresent(expirationInterval, forKey: "expirationInterval")
        try container.encodeIfPresent(expirationTime, forKey: "expirationTime")
        try container.encodeIfPresent(modified, forKey: "modified")
        try container.encodeIfPresent(scheduledTime, forKey: "scheduledTime")
        try container.encodeIfPresent(sound, forKey: "sound")
        try container.encodeIfPresent(status, forKey: "status")
        try container.encodeIfPresent(urlArgs, forKey: "urlArgs")
        try container.encodeIfPresent(id, forKey: "id")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        alert = try container.decodeIfPresent(XAny.self, forKey: "alert")
        badge = try container.decodeIfPresent(Double.self, forKey: "badge")
        category = try container.decodeIfPresent(String.self, forKey: "category")
        collapseKey = try container.decodeIfPresent(String.self, forKey: "collapseKey")
        contentAvailable = try container.decodeIfPresent(Bool.self, forKey: "contentAvailable")
        created = try container.decodeIfPresent(Date.self, forKey: "created")
        delayWhileIdle = try container.decodeIfPresent(Bool.self, forKey: "delayWhileIdle")
        deviceToken = try container.decode(String.self, forKey: "deviceToken")
        deviceType = try container.decode(String.self, forKey: "deviceType")
        expirationInterval = try container.decodeIfPresent(Double.self, forKey: "expirationInterval")
        expirationTime = try container.decodeIfPresent(Date.self, forKey: "expirationTime")
        modified = try container.decodeIfPresent(Date.self, forKey: "modified")
        scheduledTime = try container.decodeIfPresent(Date.self, forKey: "scheduledTime")
        sound = try container.decodeIfPresent(String.self, forKey: "sound")
        status = try container.decodeIfPresent(String.self, forKey: "status")
        urlArgs = try container.decodeIfPresent([String].self, forKey: "urlArgs")
        id = try container.decodeIfPresent(Double.self, forKey: "id")
    }
}
