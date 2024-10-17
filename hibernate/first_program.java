@Repository
public class AdminDao implements AdminDaoInterface{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Admin adminLoginDao(String email, String password) {
		Admin a=null;
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.revshop.entity.Admin a where a.email=:aid and a.password=:pid");
		q.setParameter("aid", email);
		q.setParameter("pid", password);
		List <Admin>al=q.getResultList();
		if(al.size()>0) {
			a=al.get(0);
		}
		return a;
	}

	

}