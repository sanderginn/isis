package org.nakedobjects.distribution.xml.request;

import org.nakedobjects.distribution.ServerDistribution;
import org.nakedobjects.object.Oid;
import org.nakedobjects.object.security.Session;

public class ClearAssociation extends AbstractRequest {
    private final String fieldIdentifier;
    private final Oid objectOid;
    private final String objectType;
    private final Oid associateOid;
    private final String associateType;

    public ClearAssociation(Session session, String fieldIdentifier, Oid objectOid, String objectType, Oid associateOid, String associateType) {
        super(session);
        this.fieldIdentifier = fieldIdentifier;
        this.objectOid = objectOid;
        this.objectType = objectType;
        this.associateOid = associateOid;
        this.associateType = associateType;
    }

    public void execute(ServerDistribution sd) {
        sd.clearAssociation(session, fieldIdentifier, objectOid, objectType, associateOid, associateType);
    }
}


/*
Naked Objects - a framework that exposes behaviourally complete
business objects directly to the user.
Copyright (C) 2000 - 2004  Naked Objects Group Ltd

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

The authors can be contacted via www.nakedobjects.org (the
registered address of Naked Objects Group is Kingsway House, 123 Goldworth
Road, Woking GU21 1NR, UK).
*/