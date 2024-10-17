@Repository
public class RetailerDao implements RetailerDaoInterface {

    @Autowired
    private SessionFactory sf;
    
    @Override
    @Transactional
	public int registerRetailer(Retailer r) {
    	int addRetailer=0;
        Session ss=sf.openSession();
		
		EntityTransaction et = ss.getTransaction();
		et.begin();
		ss.save(r);
		et.commit();
		addRetailer=1;
		return addRetailer;
	}

	@Override
	@Transactional
	public Retailer retailerLoginDao(String email, String password) {
		Retailer r= null;
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.revshop.entity.Retailer r where r.retailerEmail=:rid AND r.retailerPassword=:pid");
		q.setParameter("rid", email);
		q.setParameter("pid", password);
		List<Retailer> rl=q.getResultList();
		
		if(rl.size()>0) {
			r=rl.get(0);
		}
		return r;
	}

	