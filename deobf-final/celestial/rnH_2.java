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
   private static final Logger class_ = LogManager.getLogger();
   private final rnW_2 break_;
   private final MBeanInfo byte_;
   private final Map<String, rny_3> protected_ = Stream.of(
         new rny_3("tickTimes", this::break_, "Historical tick times (ms)", long[].class),
         new rny_3("averageTickTime", this::class_, "Current average tick time (ms)", long.class)
      )
      .collect(Collectors.toMap(var0 -> var0.class_, Function.identity()));

   @Override
   public Object invoke(String var1, Object[] var2, String[] var3) {
      return null;
   }

   private rnH_2(rnW_2 var1) {
      this.break_ = var1;
      MBeanAttributeInfo[] var2 = this.protected_.values().stream().map(var0 -> var0.class_()).toArray(MBeanAttributeInfo[]::new);
      this.byte_ = new MBeanInfo(
         rnH_2.class.getSimpleName(),
         "metrics for dedicated server",
         var2,
         (MBeanConstructorInfo[])null,
         (MBeanOperationInfo[])null,
         new MBeanNotificationInfo[0]
      );
   }

   public static void class_(rnW_2 var0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new rnH_2(var0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException | InstanceAlreadyExistsException var2) {
         class_.warn("Failed to initialise server as JMX bean", var2);
      }
   }

   private float class_() {
      return this.break_.a();
   }

   @Override
   public AttributeList getAttributes(String[] var1) {
      List var2 = Arrays.stream(var1)
         .map(this.protected_::get)
         .filter(Objects::nonNull)
         .map(var0 -> new Attribute(var0.class_, var0.break_.get()))
         .collect(Collectors.toList());
      return new AttributeList(var2);
   }

   private long[] break_() {
      return this.break_.private_;
   }

   @Override
   public void setAttribute(Attribute var1) {
   }

   @Override
   public Object getAttribute(String var1) {
      rny_3 var2 = this.protected_.get(var1);
      return var2 == null ? null : var2.break_.get();
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.byte_;
   }

   @Override
   public AttributeList setAttributes(AttributeList var1) {
      return new AttributeList();
   }
}
