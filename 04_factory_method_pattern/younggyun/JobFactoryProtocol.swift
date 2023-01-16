import Foundation

// Creator
public protocol JobFactoryProtocol {
  func createJobSeeker(contact: Contact) -> JobSeekerProtocol
  func sendEmail(contact: Contact)
}

extension JobFactoryProtocol {
  public func sendEmail(contact: Contact) {
    var seeker: JobSeekerProtocol = self.createJobSeeker(contact: contact)
    print(seeker.sendRequestResumeEmail())
  }
}
