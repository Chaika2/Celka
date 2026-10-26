package celestial;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StaffViewer extends Module implements rrqJ_2, rrqO_2 {
   private static byte[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static String[] catch_;
   public static Object[] byte_;
   private static short[] private_;

   public StaffViewer() {
      super("Staff Viewer", "Отображает активный персонал\nна сервере", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.public_();
      HashSet var5 = new HashSet();
      this.break_[0] = var5;
      Ordering var6 = Ordering.from(new rrqb_3());
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Сообщать об изменении\nстатуса персонала", true);
      this.break_[2] = var7;
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).class_(this);
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).class_(this);
      this.class_((rrIk_1)this.break_[2]);
   }

   static {
      ntfClinit();
   }

   @Override
   public void this_() {
      this.case_(false);
   }

   @Override
   public void class_(String var1, boolean var2) {
      this.public_();
      if (var2) {
         for (rrqr_3 var4 : (Set)this.break_[0]) {
            if (var4 instanceof rrqP_2 var5
               && var5.case_().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])
               && var5.class_().class_().getName().equalsIgnoreCase(var1)) {
               var4.class_(false);
               break;
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 472127657;
   }

   private void class_(Aw_1 var1) {
      this.public_();
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         if (var1 != null) {
            if (var1.class_().getName().equalsIgnoreCase(import_.while_().byte_().toLowerCase())) {
               return;
            }

            rnB_2 var2 = var1.implements_();
            if (var2 == null) {
               return;
            }

            String var3 = var2.class_();
            if (!var3.contains("-") && var3.startsWith("6") && var3.endsWith("A")) {
               rrqP_2 var4 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var1, var2.protected_().byte_());
               ((Set)this.break_[0]).add(var4);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLL var1) {
      this.public_();
      if ((gm_3)import_.class_[56] != null) {
         Aw_1 var2 = var1.break_();
         String var3 = var2.class_().getName();
         String var4 = var1.class_().byte_();
         rrqB_2 var5 = rrqB_2.class_(var2, var3, var4);
         this.class_(var5, var2);
         this.class_(var2);
         if (var5 != null) {
            rrqP_2 var6 = new rrqP_2(var5, var2, var4);
            ((Set)this.break_[0]).add(var6);
         }
      }
   }

   @EventTarget
   public void class_(rrFV var1) {
      this.public_();
      if (((rrIk_1)this.break_[2]).class_()) {
         this.break_(var1);
      }
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.public_();
      ((Set)this.break_[0]).removeIf(var0 -> !var0.throws_() ? true : throws_[7]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -566492125520163404L;
   }

   private void class_(rrqB_2 var1, Aw_1 var2) {
      this.public_();
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         if (var1 == null) {
            rnB_2 var3 = var2.implements_();
            if (var3 == null) {
               return;
            }

            GameProfile var4 = var2.class_();
            if (var4.getName().equalsIgnoreCase(import_.while_().byte_().toLowerCase())) {
               return;
            }

            String var5 = var3.class_();
            if (!var5.contains("-") && var5.startsWith("V") && var5.endsWith("A")) {
               rrqP_2 var6 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var2, var3.protected_().byte_());
               ((Set)this.break_[0]).add(var6);
            }
         }
      }
   }

   @Override
   public void break_(String var1, boolean var2) {
      this.public_();
      if (var2) {
         for (rrqr_3 var4 : (Set)this.break_[0]) {
            if (var4 instanceof rrqP_2) {
               rrqP_2 var5 = (rrqP_2)var4;
               if (var5.case_().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])
                  && var5.extends_().toLowerCase().contains(var1.toLowerCase())) {
                  var5.class_(false);
               }
            }
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, -102, -45, -29, -104, -89, -62, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(rrFV var1) {
      rrqP_2 var2 = var1.byte_();
      rrqS_2 var3 = var1.class_();
      rrqS_2 var4 = var1.break_();

      String var5 = switch (((int[])rrqG_2.class_[0])[var3.ordinal()]) {
         case 1 -> catch_[13];
         case 2 -> catch_[14];
         case 3 -> catch_[15];
         case 4 -> {
            switch (((int[])rrqG_2.class_[0])[var4.ordinal()]) {
               case 1:
                  yield catch_[9];
               case 2:
                  yield catch_[10];
               case 3:
                  yield catch_[11];
               default:
                  yield catch_[12];
            }
         }
         case 5 -> catch_[16];
         default -> null;
      };
      if (var5 != null) {
         rgN_2 var6 = new rgN_2(this.final_());
         rVi_1 var7 = var2.implements_().break_(" " + var5);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3(var6, var7, 5000));
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.public_();
      super.throws_(var1);

      for (rrqr_3 var3 : (Set)this.break_[0]) {
         if (!var3.throws_()) {
            var3.class_(false);
         }
      }
   }

   private static void goto_() {
      Object[] var0 = new Object[]{rrfu_3.class_().break_(rVa_1.class_("#ff0000"), rVa_1.class_("#ff7f7f")).class_("Персонал ").break_()};
      byte_ = var0;
   }

   private void case_(boolean var1) {
      this.public_();

      for (rrqr_3 var3 : (Set)this.break_[0]) {
         if (var3 instanceof rrqP_2) {
            rrqP_2 var4 = (rrqP_2)var3;
            if (var4.case_().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])) {
               var4.class_(var1);
            }
         }
      }
   }

   @Override
   public void continue_() {
      this.case_(false);
   }

   private static void else_() {
      throws_ = new boolean[]{true, false, false, false, false, false, true, false, false, true};
   }

   public Set<rrqr_3> new_() {
      this.public_();
      return (Set<rrqr_3>)this.break_[0];
   }

   private static void return_() {
      protected_ = new byte[]{3};
   }

   public List<rrqr_3> super_() {
      this.public_();
      return ((Ordering)this.break_[1]).sortedCopy((Set)this.break_[0]);
   }

   private static void try_() {
      catch_ = new String[]{
         new String("Staff Viewer"),
         new String("Отображает активный персонал\nна сервере"),
         new String("Сообщать об изменении\nстатуса персонала"),
         new String("-"),
         new String("6"),
         new String("A"),
         new String("-"),
         new String("V"),
         new String("A"),
         new String("вышел из спека"),
         new String("вышел из GM3"),
         new String("ушёл от вас"),
         new String("в активном статусе"),
         new String("зашёл в спек"),
         new String("зашёл в GM3"),
         new String("рядом с вами"),
         new String("вышел с сервера"),
         new String("#ff0000"),
         new String("#ff7f7f"),
         new String("Персонал ")
      };
   }

   private static void while_() {
      private_ = new short[]{2, 0, 1, 2, 0, 0, 2, 56, 0, 2, 0, 0, 10, 0, 10, 0, 0, 10, 1, 2, 3, 0, 1, 0, 3, 0, 0, 0, 0, 5000, 1, 0, 0};
   }

   private void public_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
      }
   }
}
