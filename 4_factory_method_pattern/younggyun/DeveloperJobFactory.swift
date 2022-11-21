import Foundation

// Concreate Creator
public class DeveloperJobFactory: JobFactoryProtocol {
  public init() { }
  
  public func createJobSeeker(contact: Contact) -> JobContactProtocol {
    switch contact.job {
    case .iOS:
      return iOSDeveloperJonSeeker(contact: contact)
    case .Android:
      return AndroidDeveloperJobSeeker(contact: contact)
    case .Web:
      return WebDeveloperJobSeeker(contact: contact)
    }
  }
}

