import SwiftUI
import shared

struct ContentView: View {
    
    var body: some View {
        Text(getGreetings())
    }
    
   
	
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

func getGreetings()->String{
    for i in 0..<1000 {
        DispatchQueue.global(qos: .background).async {
            usleep(200000)
            print("storage read before \(Thread.current)")
            Greeting().greet()
            print("storage read after \(Thread.current)")
        }
    }
    return Greeting().greet()
}
