package org.srpingcat.cas.jdbc;

import org.jasig.services.persondir.IPersonAttributes;
import org.jasig.services.persondir.support.AttributeNamedPersonImpl;
import org.jasig.services.persondir.support.StubPersonAttributeDao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jeng on 16/2/4.
 */
public class MultipleAttributeUserDao extends StubPersonAttributeDao {

    @Override
    public IPersonAttributes getPerson(String uid) {
        Map<String, List<Object>> attributes = new HashMap<String, List<Object>>();
        attributes.put("userid", Collections.singletonList((Object)uid));
        attributes.put("username", Collections.singletonList((Object)"admin"));
        attributes.put("password", Collections.singletonList((Object)"5ecdf2ce7692c7e9f0608c3adb92d234e3a9f4fe"));
        attributes.put("salt", Collections.singletonList((Object)"f3292941e036634d"));
        return new AttributeNamedPersonImpl(attributes);
    }
}
