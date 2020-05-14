package untact_tutor_store판ㅁ;

public class PurchaseRequested extends AbstractEvent {

    private Long id;

    public PurchaseRequested(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
