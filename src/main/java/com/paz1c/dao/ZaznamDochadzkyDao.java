
package com.paz1c.dao;

import com.paz1c.other.ZaznamDochadzky;

public interface ZaznamDochadzkyDao {
    public boolean vlozZaznam(ZaznamDochadzky zaznam);
    public boolean upravZaznam(ZaznamDochadzky zaznam);
    public boolean zmazZaznam(ZaznamDochadzky zaznam);
    public ZaznamDochadzky getPoslednyZaznam(Long idOsoba);

    public boolean zmazVsetkyZaznamy(Long idOsoba);
}
