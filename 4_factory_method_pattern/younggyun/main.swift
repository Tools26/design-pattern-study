import Foundation

var contacts = [Contact]()
contacts.append(Contact(name: "유리", email: "yuri@naver.com", job: .Android, desiredSalary: 12100))
contacts.append(Contact(name: "짱구", email: "jjang@naver.com", job: .iOS, desiredSalary: 210000))
contacts.append(Contact(name: "훈이", email: "krock@example.com", job: .Android, desiredSalary: 12100))
contacts.append(Contact(name: "P Money", email: "pmoney@example.com", job: .Web, desiredSalary: 11200))
contacts.append(Contact(name: "S Sham", email: "ssham@example.com", job: .Android, desiredSalary: 91000))
contacts.append(Contact(name: "L Roger", email: "lroger@example.com", job: .iOS, desiredSalary: 112000))



for contact in contacts {
    let client: JobSeekerProtocol = DeveloperJobFactory().createJobSeeker(contact: contact)
    print(client.sendRequestResumeEmail())
}
