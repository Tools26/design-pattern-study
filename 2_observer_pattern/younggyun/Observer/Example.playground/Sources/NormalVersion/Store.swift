import Foundation

public class Store {
  private var iphoneAmount: Count
  private var iPadAmount: Count
  
  public init(iphoneAmount: Count = Count(count: 0),
              ipadAmount: Count = Count(count: 0)) {
    self.iphoneAmount = iphoneAmount
    self.iPadAmount = ipadAmount
  }
  
  public func addIphoneCustomer(_ o: Customer) {
    self.iphoneAmount.registerObserver(o)
  }
  
  public func addIpadCustomer(_ o: Customer) {
    self.iPadAmount.registerObserver(o)
  }
  public func addIphone(count: Int) {
    self.iphoneAmount.count = self.iphoneAmount.count + count
  }
  
  public func addIpad(count: Int) {
    self.iPadAmount.count = self.iPadAmount.count + count
  }
}
