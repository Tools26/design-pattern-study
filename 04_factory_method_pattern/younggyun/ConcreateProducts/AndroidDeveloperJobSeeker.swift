import Foundation

public class AndroidDeveloperJobSeeker: JobSeekerProtocol {
  private var contact: Contact
  
  init(contact: Contact) {
    self.contact = contact
  }
  
  public func sendRequestResumeEmail() -> String {
    return "Dear \(contact.name) Android Developer!"
  }
}
