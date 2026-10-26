package celestial;

import java.io.File;
import org.apache.commons.lang3.StringUtils;

public class rrGm_1 implements Comparable<rrGm_1> {
   private final rYE id_class;
   private final rrGN id_break;
   private final String id_byte;
   private final boolean id_protected;
   private final boolean id_throws;
   private final File id_case;
   private rgP_2 id_catch;

   public File id_byte() {
      return this.id_case;
   }

   private rgP_2 id_int() {
      if (this.id_final()) {
         return new rgn_3("selectWorld.locked").id_class(rgF_2.RED);
      } else if (this.id_protected()) {
         return new rgn_3("selectWorld.conversion");
      } else {
         Object var1 = this.id_catch()
            ? new rgN_2("").id_class(new rgn_3("gameMode.hardcore").id_class(rgF_2.DARK_RED))
            : new rgn_3("gameMode." + this.id_case().id_break());
         if (this.id_private()) {
            ((rVi_1)var1).id_break(", ").id_class(new rgn_3("selectWorld.cheats"));
         }

         rVi_1 var2 = this.id_implements();
         rVi_1 var3 = new rgN_2(", ").id_class(new rgn_3("selectWorld.version")).id_break(" ");
         if (this.id_extends()) {
            var3.id_class(var2.id_class(this.id_native() ? rgF_2.RED : rgF_2.ITALIC));
         } else {
            var3.id_class(var2);
         }

         ((rVi_1)var1).id_class(var3);
         return (rgP_2)var1;
      }
   }

   public rrGm_1(rYE var1, rrGN var2, String var3, boolean var4, boolean var5, File var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_protected = var4;
   }

   public int id_class(rrGm_1 var1) {
      if (this.id_break.id_break() < var1.id_break.id_break()) {
         return 1;
      } else {
         return this.id_break.id_break() > var1.id_break.id_break() ? -1 : this.id_byte.compareTo(var1.id_byte);
      }
   }

   public String id_class() {
      return this.id_byte;
   }

   public String id_break() {
      return StringUtils.isEmpty(this.id_class.id_class()) ? this.id_byte : this.id_class.id_class();
   }

   public long id_throws() {
      return this.id_break.id_break();
   }

   public rrGN id_finally() {
      return this.id_break;
   }

   public boolean id_catch() {
      return this.id_class.id_byte();
   }

   public boolean id_extends() {
      return this.id_native() || !rqu_3.id_class().isStable() && !this.id_break.id_throws() || this.id_volatile();
   }

   public rRl_1 id_case() {
      return this.id_class.id_break();
   }

   public rVi_1 id_implements() {
      return (rVi_1)(rql_3.id_break(this.id_break.id_byte()) ? new rgn_3("selectWorld.versionUnknown") : new rgN_2(this.id_break.id_byte()));
   }

   public rgP_2 id_package() {
      if (this.id_catch == null) {
         this.id_catch = this.id_int();
      }

      return this.id_catch;
   }

   public boolean id_protected() {
      return this.id_protected;
   }

   public boolean id_private() {
      return this.id_class.id_throws();
   }

   public boolean id_final() {
      return this.id_throws;
   }

   public boolean id_volatile() {
      return this.id_break.id_protected() < rqu_3.id_class().getWorldVersion();
   }

   public boolean id_native() {
      return this.id_break.id_protected() > rqu_3.id_class().getWorldVersion();
   }
}
