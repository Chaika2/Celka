package celestial;

import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AQ {
   private static final Logger id_class = LogManager.getLogger();
   private final QY id_break;
   private final List<Ak_1> id_byte = Lists.newArrayList();

   public int id_byte() {
      return this.id_byte.size();
   }

   public static void id_byte(Ak_1 var0) {
      AQ var1 = new AQ(QY.id_instanceof());
      var1.id_class();

      for (int var2 = 0; var2 < var1.id_byte(); var2++) {
         Ak_1 var3 = var1.id_class(var2);
         if (var3.id_class.equals(var0.id_class) && var3.id_break.equals(var0.id_break)) {
            var1.id_class(var2, var0);
            break;
         }
      }

      var1.id_break();
   }

   public AQ(QY var1) {
      this.id_break = var1;
      this.id_class();
   }

   public void id_class(int var1, int var2) {
      Ak_1 var3 = this.id_class(var1);
      this.id_byte.set(var1, this.id_class(var2));
      this.id_byte.set(var2, var3);
      this.id_break();
   }

   public void id_class(int var1, Ak_1 var2) {
      this.id_byte.set(var1, var2);
   }

   public void id_class() {
      try {
         this.id_byte.clear();
         ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[0]).id_class(this.id_byte);
         rcd_3 var1 = rcW_2.id_break(new File((File)this.id_break.id_class[24], "servers.dat"));
         if (var1 == null) {
            return;
         }

         rcy_3 var2 = var1.id_protected("servers", 10);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            this.id_byte.add(Ak_1.id_class(var2.id_class(var3)));
         }
      } catch (Exception var4) {
         id_class.error("Couldn't load server list", var4);
      }
   }

   public Ak_1 id_class(int var1) {
      return this.id_byte.get(var1);
   }

   public void id_class(Ak_1 var1) {
      this.id_byte.remove(var1);
   }

   public void id_break() {
      try {
         rcy_3 var1 = new rcy_3();

         for (Ak_1 var3 : this.id_byte) {
            if (!(var3 instanceof rrwp_3)) {
               var1.add(var3.id_class());
            }
         }

         rcd_3 var7 = new rcd_3();
         var7.id_class("servers", var1);
         File var8 = File.createTempFile("servers", ".dat", (File)this.id_break.id_class[24]);
         rcW_2.id_break(var7, var8);
         File var4 = new File((File)this.id_break.id_class[24], "servers.dat_old");
         File var5 = new File((File)this.id_break.id_class[24], "servers.dat");
         rqR_2.id_class(var5, var8, var4);
      } catch (Exception var6) {
         id_class.error("Couldn't save server list", var6);
      }
   }

   public void id_break(Ak_1 var1) {
      this.id_byte.add(var1);
   }

   public List<Ak_1> id_protected() {
      return this.id_byte;
   }
}
