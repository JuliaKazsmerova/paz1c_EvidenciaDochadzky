package com.paz1c.manager;

import com.paz1c.other.ZaznamDochadzky;

public interface ZaznamDochadzkyManager {
    public boolean vlozZaznam(ZaznamDochadzky zaznam);
    public boolean upravZaznam(ZaznamDochadzky zaznam);
    public boolean zmazZaznam(ZaznamDochadzky zaznam);
    public ZaznamDochadzky getPoslednyZaznam(Long idOsoba);
    
}
