package celestial;

import java.io.File;
import org.apache.commons.lang3.StringUtils;

public class rrGm_1 implements Comparable<rrGm_1> {
   private final rYE class_;
   private final rrGN break_;
   private final String byte_;
   private final boolean protected_;
   private final boolean throws_;
   private final File case_;
   private rgP_2 catch_;

   public File byte_() {
      return this.case_;
   }

   private rgP_2 int_() {
      if (this.final_()) {
         return new rgn_3("selectWorld.locked").class_(rgF_2.RED);
      } else if (this.protected_()) {
         return new rgn_3("selectWorld.conversion");
      } else {
         Object var1 = this.catch_()
            ? new rgN_2("").class_(new rgn_3("gameMode.hardcore").class_(rgF_2.DARK_RED))
            : new rgn_3("gameMode." + this.case_().break_());
         if (this.private_()) {
            ((rVi_1)var1).break_(", ").class_(new rgn_3("selectWorld.cheats"));
         }

         rVi_1 var2 = this.implements_();
         rVi_1 var3 = new rgN_2(", ").class_(new rgn_3("selectWorld.version")).break_(" ");
         if (this.extends_()) {
            var3.class_(var2.class_(this.native_() ? rgF_2.RED : rgF_2.ITALIC));
         } else {
            var3.class_(var2);
         }

         ((rVi_1)var1).class_(var3);
         return (rgP_2)var1;
      }
   }

   public rrGm_1(rYE var1, rrGN var2, String var3, boolean var4, boolean var5, File var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.throws_ = var5;
      this.case_ = var6;
      this.protected_ = var4;
   }

   public int class_(rrGm_1 var1) {
      if (this.break_.break_() < var1.break_.break_()) {
         return 1;
      } else {
         return this.break_.break_() > var1.break_.break_() ? -1 : this.byte_.compareTo(var1.byte_);
      }
   }

   public String class_() {
      return this.byte_;
   }

   public String break_() {
      return StringUtils.isEmpty(this.class_.class_()) ? this.byte_ : this.class_.class_();
   }

   public long throws_() {
      return this.break_.break_();
   }

   public rrGN finally_() {
      return this.break_;
   }

   public boolean catch_() {
      return this.class_.byte_();
   }

   public boolean extends_() {
      return this.native_() || !rqu_3.class_().isStable() && !this.break_.throws_() || this.volatile_();
   }

   public rRl_1 case_() {
      return this.class_.break_();
   }

   public rVi_1 implements_() {
      return (rVi_1)(rql_3.break_(this.break_.byte_()) ? new rgn_3("selectWorld.versionUnknown") : new rgN_2(this.break_.byte_()));
   }

   public rgP_2 package_() {
      if (this.catch_ == null) {
         this.catch_ = this.int_();
      }

      return this.catch_;
   }

   public boolean protected_() {
      return this.protected_;
   }

   public boolean private_() {
      return this.class_.throws_();
   }

   public boolean final_() {
      return this.throws_;
   }

   public boolean volatile_() {
      return this.break_.protected_() < rqu_3.class_().getWorldVersion();
   }

   public boolean native_() {
      return this.break_.protected_() > rqu_3.class_().getWorldVersion();
   }
}
