package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class XRay<T extends rrqN_2> extends Module implements rrqd_3 {
   private static String[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;
   public Object[] break_;
   private static short[] catch_;
   private static byte[] private_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 93, 78, 26, -94, 25, -19, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public XRay() {
      super("X-Ray", "WallHack на блоки для серверов с\nсильным античитом", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.goto_();
      rrIQ var5 = new rrIQ("Режим", "Default", "Default", "Ancient");
      this.break_[3] = var5;
      rrIm_1 var6 = new rrIm_1("Радиус сканирования", 16.0F, 6.0F, 64.0F, 1.0F);
      this.break_[4] = var6;
      rrIm_1 var7 = new rrIm_1("Скорость сканирования", 20.0F, 1.0F, 30.0F, 1.0F);
      this.break_[5] = var7;
      Boolean var8 = true;
      this.break_[6] = var8;
      rrqm_3 var9 = new rrqm_3(this);
      this.break_[0] = var9;
      rrqZ_2 var10 = new rrqZ_2(this);
      this.break_[1] = var10;
      rrqm_3 var11 = (rrqm_3)this.break_[0];
      this.break_[2] = var11;
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_(this);
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_((rrqN_2)this.break_[2]);
      ((rrIQ)this.break_[3]).class_("change_mode", (var1, var2) -> {
         this.goto_();
         if ((rrqN_2)this.break_[2] != null && this.aJ_()) {
            ((rrqN_2)this.break_[2]).aK_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_((rrqN_2)this.break_[2]);
         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Default" -> (rrqm_3)this.break_[0];
            case "Ancient" -> (rrqZ_2)this.break_[1];
            default -> null;
         };
         this.break_[2] = var9x;
         if ((rrqN_2)this.break_[2] != null && this.aJ_()) {
            ((rrqN_2)this.break_[2]).aI_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_((rrqN_2)this.break_[2]);
      });
      ((rrIm_1)this.break_[4]).class_(() -> {
         this.goto_();
         return (rrqN_2)this.break_[2] == (rrqm_3)this.break_[0] ? true : throws_[8];
      });
      ((rrIm_1)this.break_[5]).class_(() -> {
         this.goto_();
         return (rrqN_2)this.break_[2] == (rrqm_3)this.break_[0] ? true : throws_[6];
      });
      this.class_(new Setting[]{(rrIQ)this.break_[3], (rrIm_1)this.break_[4], (rrIm_1)this.break_[5]});
   }

   static {
      ntfClinit();
   }

   public rrIQ this_() {
      this.goto_();
      return (rrIQ)this.break_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 927402356696512671L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -424416841;
   }

   @Override
   public void class_(boolean var1) {
      this.goto_();
      if (((rrqN_2)this.break_[2]).aI_()) {
         super.class_(var1);
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.goto_();
      super.throws_(var1);
      ((rrqN_2)this.break_[2]).aK_();
   }

   private void goto_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         this.break_[6] = false;
      }
   }

   public void case_(boolean var1) {
      this.goto_();
      Boolean var6 = var1;
      this.break_[6] = var6;
   }

   public boolean continue_() {
      this.goto_();
      return (Boolean)this.break_[6];
   }

   public rrIm_1 else_() {
      this.goto_();
      return (rrIm_1)this.break_[4];
   }

   private static void instanceof_() {
      protected_ = new float[]{16.0F, 6.0F, 64.0F, 1.0F, 20.0F, 1.0F, 30.0F, 1.0F};
   }

   public rrIm_1 new_() {
      this.goto_();
      return (rrIm_1)this.break_[5];
   }

   public rrqZ_2 return_() {
      this.goto_();
      return (rrqZ_2)this.break_[1];
   }

   public T super_() {
      this.goto_();
      return (T)this.break_[2];
   }

   private static void throw_() {
      private_ = new byte[]{2, 3, 2, -1, 7, 6};
   }

   private static void try_() {
      byte_ = new String[]{
         new String("X-Ray"),
         new String("WallHack на блоки для серверов с\nсильным античитом"),
         new String("Режим"),
         new String("Default"),
         new String("Default"),
         new String("Ancient"),
         new String("Радиус сканирования"),
         new String("Скорость сканирования"),
         new String("change_mode"),
         new String("Default"),
         new String("Ancient")
      };
   }

   private static void while_() {
      catch_ = new short[]{4, 3, 4, 5, 6, 0, 1, 0, 2, 0, 0, 2, 3, 4, 5, 3, 4, 5, 2, 2, 0, 1, 2, 3, 4, 5, 6, 6, 2, 0, 2, 0, 2, 2, 0, 2, 0, 1, 2, 2, 2, 0, 2};
   }

   public rrqm_3 public_() {
      this.goto_();
      return (rrqm_3)this.break_[0];
   }

   private static void abstract_() {
      throws_ = new boolean[]{false, true, true, false, true, true, false, true, false, false, true, false};
   }
}
