package blog.zciok.springboot.restful.product;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRespository;

    public List<User> findAll() {
        List<User> users = userRespository.findAll();
        return users;
    }
    
    public User save(User stock) {
        return userRespository.save(stock);
    }
    
    public User findById(Long id) {        
        return userRespository.findById(id).orElseThrow(RuntimeException::new);
    }
}
