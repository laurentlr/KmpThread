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
    for _ in 0..<100 {
        Greeting().greet()
    }
    return Greeting().greet()
}
