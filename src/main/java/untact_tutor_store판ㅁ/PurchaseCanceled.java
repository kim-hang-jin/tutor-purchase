package untact_tutor_store판ㅁ;

public class PurchaseCanceled extends AbstractEvent {

    private Long id;

    public PurchaseCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
