import Foundation

public enum Job {
  case iOS
  case Android
  case Web
}

public struct Contact {
  var name: String
  var email: String
  var job: Job
  var desiredSalary: Int
  
  public init(name: String, email: String, job: Job, desiredSalary: Int) {
    self.name = name
    self.email = email
    self.job = job
    self.desiredSalary = desiredSalary
  }
}