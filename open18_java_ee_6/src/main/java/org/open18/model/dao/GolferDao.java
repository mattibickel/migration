/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.open18.model.dao;

import java.util.List;

import com.ctp.cdi.query.Dao;
import com.ctp.cdi.query.EntityDao;
import com.ctp.cdi.query.Query;
import org.open18.model.Golfer;

/**
 *
 */
@Dao(Golfer.class)
public interface GolferDao extends EntityDao<Golfer, Long> {

    @Query(value = "select g from Golfer g order by g.dateJoined desc", max = 25)
    List<Golfer> findNewGolfers();
}