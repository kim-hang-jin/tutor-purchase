package untact_tutor_store판ㅁ;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Salestargetlist_table")
public class Salestargetlist {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

}
