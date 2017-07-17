import org.junit.runner.RunWith;
import org.obsidian.scss.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/7/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
@Transactional(transactionManager = "transactionManager")
@Rollback(value = false)
public class Test {

    @Autowired
    private ConversationService conversationService;

    @org.junit.Test
    public void test(){
        int clientId = 2;
        int conversationId = 2;
        conversationService.updateClientId(conversationId,clientId);
    }
}