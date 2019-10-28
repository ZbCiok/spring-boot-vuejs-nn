
var vm = new Vue({
    el: '#app',

    data: {
        selectedLogin: '', 
        id: '', login: '', name: '', avatar_url: '', type: '', created_at: '',
        pUser: {
            id: '', login: '', name: '', avatarUrl: '', type: '', createdAt: '', calculations: ''
        },
    },

    mounted() {},

    methods: {
        axiosGetUser(selectedLogin) {
            axios.get('https://api.github.com/users/' + selectedLogin) 
                .then(function (response) {
                    const user = response.data;
                    vm.id = user.id;
                    vm.login = user.login; 
                    vm.name = user.name;  
                    vm.avatar_url = user.avatar_url; 
                    vm.type = user.type;
                    vm.created_at = user.created_at;

                    this.pUser = user
                    this.pUser.avatarUrl = user.avatar_url; 
                    this.pUser.createdAt = user.created_at; 
                })
                
            axios.get('https://api.github.com/users/' + selectedLogin + '/followers') 
                .then(function (response) {
                    this.followersCount = response.data.length;
                })    
                
            axios.get('https://api.github.com/users/' + selectedLogin + '/repos') 
                .then(function (response) {
                    this.reposCount = response.data.length;
                })                 
        },

        axiosPostUser() {
            if (followersCount != 0) {
                pUser.calculations = 6 / followersCount * (2 + reposCount);
            } else {
                pUser.calculations = -1.00;
            }
 
            axios.post('http://localhost:8080/nn-test/users', pUser)
            .then((response) => {
                console.log("Post response...");
            }, (error) => {
                console.log("Post error: " + error);
            });
        },    

        formSubmit(e) {
            this.axiosGetUser(this.selectedLogin);
        },

        postFormSubmit(e) {
            this.axiosPostUser();
        }        
    }
})
