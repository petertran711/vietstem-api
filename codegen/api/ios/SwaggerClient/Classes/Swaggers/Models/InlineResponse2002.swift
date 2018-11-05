//
// InlineResponse2002.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



open class InlineResponse2002: Codable {

    public var count: Double?


    
    public init(count: Double? = nil) {
        self.count = count
    }
    

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(count, forKey: "count")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        count = try container.decodeIfPresent(Double.self, forKey: "count")
    }
}
