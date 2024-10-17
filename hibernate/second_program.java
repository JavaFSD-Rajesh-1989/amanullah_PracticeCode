@Repository
public class BuyerDao implements BuyerDaoInterface {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int registerBuyer(Buyer b) {
		int addBuyer=0;
		Session ss= sf.openSession();
		EntityTransaction et = ss.getTransaction();
		et.begin();
		ss.save(b);
		et.commit();
		addBuyer=1;
		return addBuyer;
	}
	
	@Override
	public int addToCartDao(Cart sCart) {
		int addCart=0;
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		 ss.save(sCart);
		 et.commit();
		 addCart=1;
		 return addCart;
	}

		