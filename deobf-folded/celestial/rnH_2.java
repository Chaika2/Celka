package celestial;

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
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rnH_2 implements DynamicMBean {
   private static final Logger id_class = LogManager.getLogger();
   private final rnW_2 id_break;
   private final MBeanInfo id_byte;
   private final Map<String, rny_3> id_protected = Stream.of(
         new rny_3("tickTimes", this::id_break, "Historical tick times (ms)", long[].class),
         new rny_3("averageTickTime", this::id_class, "Current average tick time (ms)", long.class)
      )
      .collect(Collectors.toMap(var0 -> var0.id_class, Function.identity()));

   @Override
   public Object invoke(String var1, Object[] var2, String[] var3) {
      return null;
   }

   private rnH_2(rnW_2 var1) {
      this.id_break = var1;
      MBeanAttributeInfo[] var2 = this.id_protected.values().stream().map(var0 -> var0.id_class()).toArray(MBeanAttributeInfo[]::new);
      this.id_byte = new MBeanInfo(
         rnH_2.class.getSimpleName(),
         "metrics for dedicated server",
         var2,
         (MBeanConstructorInfo[])null,
         (MBeanOperationInfo[])null,
         new MBeanNotificationInfo[0]
      );
   }

   public static void id_class(rnW_2 var0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new rnH_2(var0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException | InstanceAlreadyExistsException var2) {
         id_class.warn("Failed to initialise server as JMX bean", var2);
      }
   }

   private float id_class() {
      return this.id_break.a();
   }

   @Override
   public AttributeList getAttributes(String[] var1) {
      List var2 = Arrays.stream(var1)
         .map(this.id_protected::get)
         .filter(Objects::nonNull)
         .map(var0 -> new Attribute(var0.id_class, var0.id_break.get()))
         .collect(Collectors.toList());
      return new AttributeList(var2);
   }

   private long[] id_break() {
      return this.id_break.id_private;
   }

   @Override
   public void setAttribute(Attribute var1) {
   }

   @Override
   public Object getAttribute(String var1) {
      rny_3 var2 = this.id_protected.get(var1);
      return var2 == null ? null : var2.id_break.get();
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.id_byte;
   }

   @Override
   public AttributeList setAttributes(AttributeList var1) {
      return new AttributeList();
   }
}
