package asg

class UserController {
    def scaffold =  true 

    def index() { }

    def home() {
        String username = params.uName;
        String password = params.pwd;

        User user = User.findByNameAndPassword(username, password)
        if(user) {
            forward(action: 'index')
        } else {
            render(view: 'login')
        }
    }
}
