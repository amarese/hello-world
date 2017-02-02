package pe.mar.example.helloworld.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.mar.example.helloworld.dto.Friend;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendMapperTest {
	@Autowired
	FriendMapper friendMapper;

	@Test
	public void test() {
		List<Friend> friends = friendMapper.findByGroup("친구");
		assertNotNull(friends);
	}
}
