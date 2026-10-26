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
   private static short[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;
   public Object[] id_class;
   private static byte[] id_private;
   private static float[] id_implements;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1055381708;
   }

   public rrjH_2(List<ProtocolVersion> var1, int var2, int var3, int var4, int var5) {
      super(var2, var3, Math.max(var4, 110), var5, new rgN_2(id_catch[0]));
      this.id_extends();
      ArrayList var12 = new ArrayList(var1);
      this.id_class[id_throws[0]] = var12;
      Collections.reverse((List<?>)this.id_class[id_throws[1]]);
      ProtocolVersion var6 = ProtocolVersion.getProtocol(rrjA_2.id_protected().id_throws().getVersion());
      int var7 = ((List)this.id_class[id_throws[2]]).indexOf(var6);
      if (var7 == -1) {
         var7 = id_case[0];
      }

      Float var13 = (float)var7 / (float)(((List)this.id_class[id_throws[3]]).size() - 1);
      this.id_class[1] = var13;
      this.id_break(new rgN_2(((ProtocolVersion)((List)this.id_class[id_throws[5]]).get(var7)).getName()));
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      this.id_extends();
      Boolean var10 = id_case[9];
      this.id_class[2] = var10;
      return super.id_class(var1, var3, var5);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      this.id_extends();
      if (this.id_new && (Boolean)this.id_class[2]) {
         Float var14 = rfU_2.id_class((float)(var1 - (double)(this.id_volatile + 4)) / (float)(this.id_extends - 8), id_implements[4], 1.0F);
         this.id_class[1] = var14;
         this.id_final();
      }

      return super.id_class(var1, var3, var5, var6, var8);
   }

   @Override
   public void id_class(Ml_1 var1, QY var2, int var3, int var4) {
      this.id_extends();
      var2.A().id_class(id_finally);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = (this.B_() ? 2 : 1) * 20;
      int var6 = this.id_volatile + (int)((Float)this.id_class[1] * (float)(this.id_extends - 8));
      int var7 = this.id_final;
      int var8 = 46 + var5;
      this.id_break(var1, var6, var7, id_case[3], var8, 4, 20);
      this.id_break(var1, var6 + 4, var7, 196, var8, 4, 20);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7827675484869123499L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, 12, -15, -33, -68, 3, -93, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_extends();
      if (super.id_break(var1, var3, var5)) {
         Float var10 = rfU_2.id_class((float)(var1 - (double)(this.id_volatile + 4)) / (float)(this.id_extends - 8), id_implements[6], 1.0F);
         this.id_class[1] = var10;
         this.id_final();
         Boolean var11 = true;
         this.id_class[2] = var11;
         return true;
      } else {
         return id_case[7];
      }
   }

   private static void id_catch() {
      id_implements = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = id_implements[8];
         var1[2] = id_case[11];
      }
   }

   private static void id_implements() {
      id_catch = new String[]{new String("")};
   }

   private static void id_private() {
      id_case = new boolean[]{false, true, true, false, false, true, true, false, true, false, true, false};
   }

   private void id_final() {
      this.id_extends();
      int var1 = (int)((Float)this.id_class[1] * (float)(((List)this.id_class[id_throws[13]]).size() - 1));
      ProtocolVersion var2 = (ProtocolVersion)((List)this.id_class[id_throws[14]]).get(var1);
      this.id_break(new rgN_2(var2.getName()));
      rrjA_2.id_protected().id_class(var2);
   }

   private static void id_volatile() {
      id_private = new byte[]{110, -1, 2, 20, 8, 46, 4, 20, 4, 4, 20, 4, 8, 4, 8, 3, 2};
   }

   private static void id_native() {
      id_throws = new short[]{0, 0, 0, 0, 1, 0, 1, 196, 2, 1, 1, 2, 1, 0, 0, 2};
   }

   @Override
   public int a_(boolean var1) {
      return id_case[4];
   }
}
