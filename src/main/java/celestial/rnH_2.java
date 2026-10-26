/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rnW_2;
import celestial.rny_3;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rnH_2
implements DynamicMBean {
    private static final Logger id_class = LogManager.getLogger();
    private final rnW_2 id_break;
    private final MBeanInfo id_byte;
    private final Map<String, rny_3> id_protected = Stream.of(new rny_3("tickTimes", this::id_break, "Historical tick times (ms)", long[].class), new rny_3("averageTickTime", this::id_class, "Current average tick time (ms)", Long.TYPE)).collect(Collectors.toMap(rny_32 -> rny_32.id_class, Function.identity()));

    @Override
    public Object invoke(String string, Object[] objectArray, String[] stringArray) {
        return null;
    }

    private rnH_2(rnW_2 rnW_22) {
        this.id_break = rnW_22;
        MBeanAttributeInfo[] mBeanAttributeInfoArray = (MBeanAttributeInfo[])this.id_protected.values().stream().map(rny_32 -> rny_32.id_class()).toArray(MBeanAttributeInfo[]::new);
        this.id_byte = new MBeanInfo(rnH_2.class.getSimpleName(), "metrics for dedicated server", mBeanAttributeInfoArray, null, null, new MBeanNotificationInfo[0]);
    }

    public static void id_class(rnW_2 rnW_22) {
        try {
            ManagementFactory.getPlatformMBeanServer().registerMBean(new rnH_2(rnW_22), new ObjectName("net.minecraft.server:type=Server"));
        }
        catch (InstanceAlreadyExistsException | MBeanRegistrationException | MalformedObjectNameException | NotCompliantMBeanException jMException) {
            id_class.warn("Failed to initialise server as JMX bean", (Throwable)jMException);
        }
    }

    private float id_class() {
        return this.id_break.a();
    }

    @Override
    public AttributeList getAttributes(String[] stringArray) {
        List<Attribute> list = Arrays.stream(stringArray).map(this.id_protected::get).filter(Objects::nonNull).map(rny_32 -> new Attribute(rny_32.id_class, rny_32.id_break.get())).collect(Collectors.toList());
        return new AttributeList(list);
    }

    private long[] id_break() {
        return this.id_break.id_private;
    }

    @Override
    public void setAttribute(Attribute attribute) {
    }

    @Override
    public Object getAttribute(String string) {
        rny_3 rny_32 = this.id_protected.get(string);
        return rny_32 == null ? null : rny_32.id_break.get();
    }

    @Override
    public MBeanInfo getMBeanInfo() {
        return this.id_byte;
    }

    @Override
    public AttributeList setAttributes(AttributeList attributeList) {
        return new AttributeList();
    }
}

