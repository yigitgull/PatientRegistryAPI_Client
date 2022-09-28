package entities;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
@Entity
public class Document extends BaseEntity{

        private LocalDateTime registryDate;
        @Lob
        private String text;
        @OneToOne(mappedBy = "document")
        private Patient patient;

    public Document() {
    }

    public Document(LocalDateTime registryDate, String text) {

            this.registryDate = registryDate;
            this.text = text;
        }

        public LocalDateTime getRegistryDate() {
            return registryDate;
        }

        public void setRegistryDate(LocalDateTime registryDate) {
            this.registryDate = registryDate;
        }


        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
