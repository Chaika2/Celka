package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqk_3 extends rrqN_2 {
   private static byte[] byte_;
   private static float[] protected_;
   private static String[] case_;
   private static boolean[] catch_;
   public Object[] class_;
   private static short[] private_;

   public Comparator<rja_3> byte_() {
      this.this_();
      return (Comparator<rja_3>)this.class_[1];
   }

   private static void int_() {
      case_ = new String[]{new String("Сканирование..."), new String("Готово!"), new String("Остановлен"), new String("Добавьте блоки через команду '.xray'")};
   }

   public rrqk_3(XRay<?> var1) {
      super(var1);
      this.this_();
      ArrayList var6 = new ArrayList();
      this.class_[0] = var6;
      rrqW_2 var7 = new rrqW_2();
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[3] = 0;
         this.class_[4] = 0;
         this.class_[5] = false;
      }
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.continue_().byte_(false);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -643653164366629159L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 97, 72, 65, -45, 78, -45, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrnB_2 var1) {
      this.this_();
      Ml_1 var2 = var1.class_();
      Qg_1 var3 = import_.else_();
      rrZO var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      String var5 = rrfu_3.class_(this.continue_()) + (Integer)this.class_[4] + " / " + (Integer)this.class_[3];
      String var6 = "Сканирование...";
      if ((Boolean)this.class_[5]) {
         var6 = "Готово!";
      } else if (!this.continue_().continue_()) {
         var6 = "Остановлен";
      }

      int var7 = (int)(var3.volatile_() / 2.0F);
      int var8 = (int)(var3.final_() / 2.0F + 20.0F);
      var4.class_(var2, var5, (float)var7, (float)var8, rrZF.d_, false);
      var4.class_(var2, var6, (double)((float)var7 - var4.break_(var6) / 2.0F), (double)(var8 + 10), 15, 255);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -837448356;
   }

   public void class_(float var1) {
      this.this_();
      if ((cb_3)import_.class_[57] != null && (gm_3)import_.class_[56] != null) {
         ((List)this.class_[0]).clear();
         rrjc_3.class_(this::class_, (rrju_3)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[0], var1).forEach(var1x -> {
            this.this_();
            ((List)this.class_[0]).add(new rja_3(var1x.b_(), var1x.c_(), var1x.d_()));
         });
         ((List)this.class_[0]).sort(new rrqW_2());
         Integer var6 = ((List)this.class_[0]).size();
         this.class_[3] = var6;
      }
   }

   private boolean class_(rfH_2 var1) {
      return !((gm_3)import_.class_[56]).instanceof_().class_(var1) ? false : catch_[12];
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && (Integer)this.class_[4] == (Integer)this.class_[3]
         && !(Boolean)this.class_[5]) {
         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(this.final_().stream().map(var0 -> var0.class_()).toList());
         Boolean var6 = true;
         this.class_[5] = var6;
      }
   }

   public void class_(rja_3 var1) {
      this.this_();
      this.class_[2] = var1;
   }

   public void class_() {
      this.this_();
      Integer var5 = (Integer)this.class_[4] + 1;
      this.class_[4] = var5;
   }

   @Override
   public void class_(rrAM var1) {
      super.class_(var1);
      this.continue_().byte_(false);
   }

   @EventTarget
   public void class_(rrLM var1) {
      this.continue_().byte_(false);
   }

   @Override
   public void break_(rrqz_3 var1, boolean var2) {
      if (var2) {
         this.return_();
      }
   }

   public boolean finally_() {
      this.this_();
      return (Boolean)this.class_[5];
   }

   public List<rja_3> extends_() {
      this.this_();
      return (List<rja_3>)this.class_[0];
   }

   public rja_3 case_() {
      this.this_();
      return (rja_3)this.class_[2];
   }

   private static void else_() {
      protected_ = new float[]{2.0F, 2.0F, 20.0F, 2.0F};
   }

   public int implements_() {
      this.this_();
      return (Integer)this.class_[3];
   }

   private static void new_() {
      private_ = new short[]{0, 1, 0, 4, 3, 5, 0, 5, 0, 4, 3, 5, 255, 4, 4, 2, 0, 57, 56, 0, 0, 0, 0, 3, 3, 4, 5, 56, 57, 56, 0, 0, 2000, 0, 1, 2, 3, 4, 5, 0};
   }

   private boolean return_() {
      XRay var1 = this.continue_();
      if ((cb_3)import_.class_[57] == null || (gm_3)import_.class_[56] == null || !var1.aJ_()) {
         return catch_[13];
      } else if (((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_().isEmpty()) {
         var1.byte_(false);
         String var2 = "Добавьте блоки через команду '.xray'";
         rrfu_3.byte_(rrfu_3.class_((Module)var1) + var2);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var1.final_(), var2, 2000));
         return true;
      } else {
         return catch_[16];
      }
   }

   private static void public_() {
      byte_ = new byte[]{10, 15, 6, 3, 4, 5};
   }

   public int protected_() {
      this.this_();
      return (Integer)this.class_[4];
   }

   public void private_() {
      this.this_();
      ((List)this.class_[0]).clear();
   }

   private static void synchronized_() {
      catch_ = new boolean[]{
         false, false, false, true, false, true, false, true, false, false, false, false, true, false, false, true, false, false, false, false
      };
   }

   @Override
   public void native_() {
      this.this_();
      super.native_();
      this.private_();
      this.package_();
      this.class_(null);
      Integer var5 = 0;
      this.class_[3] = var5;
      Integer var6 = 0;
      this.class_[4] = var6;
      Boolean var7 = false;
      this.class_[5] = var7;
   }

   @Override
   public boolean aI_() {
      boolean var1 = super.aI_() && !this.return_() ? true : catch_[6];
      if (var1) {
         this.class_(this.continue_().else_().byte_());
      }

      return var1;
   }

   @Override
   public void g_() {
      this.return_();
   }
}
