package celestial;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AQ {
   private static final Logger class_ = LogManager.getLogger();
   private final QY break_;
   private final List<Ak_1> byte_ = Lists.newArrayList();

   public int byte_() {
      return this.byte_.size();
   }

   public static void byte_(Ak_1 var0) {
      AQ var1 = new AQ(QY.instanceof_());
      var1.class_();

      for (int var2 = 0; var2 < var1.byte_(); var2++) {
         Ak_1 var3 = var1.class_(var2);
         if (var3.class_.equals(var0.class_) && var3.break_.equals(var0.break_)) {
            var1.class_(var2, var0);
            break;
         }
      }

      var1.break_();
   }

   public AQ(QY var1) {
      this.break_ = var1;
      this.class_();
   }

   public void class_(int var1, int var2) {
      Ak_1 var3 = this.class_(var1);
      this.byte_.set(var1, this.class_(var2));
      this.byte_.set(var2, var3);
      this.break_();
   }

   public void class_(int var1, Ak_1 var2) {
      this.byte_.set(var1, var2);
   }

   public void class_() {
      try {
         this.byte_.clear();
         ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[0]).class_(this.byte_);
         rcd_3 var1 = rcW_2.break_(new File((File)this.break_.class_[24], "servers.dat"));
         if (var1 == null) {
            return;
         }

         rcy_3 var2 = var1.protected_("servers", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            this.byte_.add(Ak_1.class_(var2.class_(var3)));
         }
      } catch (Exception var4) {
         class_.error("Couldn't load server list", var4);
      }
   }

   public Ak_1 class_(int var1) {
      return this.byte_.get(var1);
   }

   public void class_(Ak_1 var1) {
      this.byte_.remove(var1);
   }

   public void break_() {
      try {
         rcy_3 var1 = new rcy_3();

         for (Ak_1 var3 : this.byte_) {
            if (!(var3 instanceof rrwp_3)) {
               var1.add(var3.class_());
            }
         }

         rcd_3 var7 = new rcd_3();
         var7.class_("servers", var1);
         File var8 = File.createTempFile("servers", ".dat", (File)this.break_.class_[24]);
         rcW_2.break_(var7, var8);
         File var4 = new File((File)this.break_.class_[24], "servers.dat_old");
         File var5 = new File((File)this.break_.class_[24], "servers.dat");
         rqR_2.class_(var5, var8, var4);
      } catch (Exception var6) {
         class_.error("Couldn't save server list", var6);
      }
   }

   public void break_(Ak_1 var1) {
      this.byte_.add(var1);
   }

   public List<Ak_1> protected_() {
      return this.byte_;
   }
}
