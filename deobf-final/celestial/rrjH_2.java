package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjH_2 extends LZ {
   private static short[] throws_;
   private static boolean[] case_;
   private static String[] catch_;
   public Object[] class_;
   private static byte[] private_;
   private static float[] implements_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1055381708;
   }

   public rrjH_2(List<ProtocolVersion> var1, int var2, int var3, int var4, int var5) {
      super(var2, var3, Math.max(var4, 110), var5, new rgN_2(""));
      this.extends_();
      ArrayList var12 = new ArrayList(var1);
      this.class_[0] = var12;
      Collections.reverse((List<?>)this.class_[0]);
      ProtocolVersion var6 = ProtocolVersion.getProtocol(rrjA_2.protected_().throws_().getVersion());
      int var7 = ((List)this.class_[0]).indexOf(var6);
      if (var7 == -1) {
         var7 = 0;
      }

      Float var13 = (float)var7 / (float)(((List)this.class_[0]).size() - 1);
      this.class_[1] = var13;
      this.break_(new rgN_2(((ProtocolVersion)((List)this.class_[0]).get(var7)).getName()));
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      this.extends_();
      Boolean var10 = false;
      this.class_[2] = var10;
      return super.class_(var1, var3, var5);
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      this.extends_();
      if (this.new_ && (Boolean)this.class_[2]) {
         Float var14 = rfU_2.class_((float)(var1 - (double)(this.volatile_ + 4)) / (float)(this.extends_ - 8), 0.0F, 1.0F);
         this.class_[1] = var14;
         this.final_();
      }

      return super.class_(var1, var3, var5, var6, var8);
   }

   @Override
   public void class_(Ml_1 var1, QY var2, int var3, int var4) {
      this.extends_();
      var2.A().class_(finally_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = (this.B_() ? 2 : case_[2]) * private_[3];
      int var6 = this.volatile_ + (int)((Float)this.class_[1] * (float)(this.extends_ - 8));
      int var7 = this.final_;
      int var8 = 46 + var5;
      this.break_(var1, var6, var7, 0, var8, 4, 20);
      this.break_(var1, var6 + 4, var7, 196, var8, 4, 20);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7827675484869123499L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, 12, -15, -33, -68, 3, -93, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.extends_();
      if (super.break_(var1, var3, var5)) {
         Float var10 = rfU_2.class_((float)(var1 - (double)(this.volatile_ + 4)) / (float)(this.extends_ - 8), 0.0F, 1.0F);
         this.class_[1] = var10;
         this.final_();
         Boolean var11 = true;
         this.class_[2] = var11;
         return true;
      } else {
         return case_[7];
      }
   }

   private static void catch_() {
      implements_ = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
         var1[2] = false;
      }
   }

   private static void implements_() {
      catch_ = new String[]{new String("")};
   }

   private static void private_() {
      case_ = new boolean[]{false, true, true, false, false, true, true, false, true, false, true, false};
   }

   private void final_() {
      this.extends_();
      int var1 = (int)((Float)this.class_[1] * (float)(((List)this.class_[0]).size() - 1));
      ProtocolVersion var2 = (ProtocolVersion)((List)this.class_[0]).get(var1);
      this.break_(new rgN_2(var2.getName()));
      rrjA_2.protected_().class_(var2);
   }

   private static void volatile_() {
      private_ = new byte[]{110, -1, 2, 20, 8, 46, 4, 20, 4, 4, 20, 4, 8, 4, 8, 3, 2};
   }

   private static void native_() {
      throws_ = new short[]{0, 0, 0, 0, 1, 0, 1, 196, 2, 1, 1, 2, 1, 0, 0, 2};
   }

   @Override
   public int a_(boolean var1) {
      return 0;
   }
}
