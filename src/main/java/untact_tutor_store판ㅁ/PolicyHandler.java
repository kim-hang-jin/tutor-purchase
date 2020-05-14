package untact_tutor_store판ㅁ;

import untact_tutor_store판ㅁ.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_ChangePurchaseStatus(@Payload PaymentCanceled paymentCanceled){

        if(paymentCanceled.isMe()){
            System.out.println("##### listener ChangePurchaseStatus : " + paymentCanceled.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_SalesTargetStatusChange(@Payload PaymentCanceled paymentCanceled){

        if(paymentCanceled.isMe()){
            System.out.println("##### listener SalesTargetStatusChange : " + paymentCanceled.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTutoringRegistered_SalesTargetStatusChange(@Payload TutoringRegistered tutoringRegistered){

        if(tutoringRegistered.isMe()){
            System.out.println("##### listener SalesTargetStatusChange : " + tutoringRegistered.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTutorDeleted_SalesTargetStatusChange(@Payload TutorDeleted tutorDeleted){

        if(tutorDeleted.isMe()){
            System.out.println("##### listener SalesTargetStatusChange : " + tutorDeleted.toJson());
        }
    }

}
