package bg.infosys.daeu.db.dao.budgets;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import bg.infosys.common.db.dao.GenericDaoImpl;
import bg.infosys.common.db.dao.aux.Restrictions;
import bg.infosys.daeu.db.entity.budgets.RowValueType;

@Repository
public class RowValueTypeDAO extends GenericDaoImpl<RowValueType, String> {

	public RowValueType getRowValueByCode(String code) {
		CriteriaBuilder builder = criteriaBuilder();
		CriteriaQuery<RowValueType> criteria = builder.createQuery(RowValueType.class);
		Root<RowValueType> root = criteria.from(RowValueType.class);
		Restrictions r = new Restrictions();
		r.add(builder.equal(root.get(RowValueType._code), code));
		r.apply(builder, root, criteria, true);
		
		try {
			return createQuery(criteria).getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

}
