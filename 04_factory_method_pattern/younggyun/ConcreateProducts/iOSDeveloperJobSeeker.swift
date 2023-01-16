import Foundation

public class iOSDeveloperJonSeeker: JobSeekerProtocol {
  private var contact: Contact
  
  init(contact: Contact) {
    self.contact = contact
  }
  
  public func sendRequestResumeEmail() -> String {
    return "Dear \(contact.name) iOS Developer!"
  }
}
