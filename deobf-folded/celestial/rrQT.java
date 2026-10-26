package celestial;

import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class rrQT implements MinecraftAccessor {
   private static int[] id_break;
   private static long[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;
   private static float[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;
   private static short[] id_private;

   public rrQC id_byte() {
      return (rrQC)this.id_class[id_private[43]];
   }

   private static void id_int() {
      id_catch = new String[]{new String("Must be 64 pixels wide"), new String("Must be 64 pixels high")};
   }

   public rrQT(rrQC var1, Ak_1 var2) {
      this.id_extends();
      rruv_1 var7 = new rruv_1(id_throws[0], id_throws[1], id_throws[2], id_throws[3]);
      this.id_class[5] = var7;
      this.id_class[id_private[1]] = var1;
      this.id_class[1] = var2;
      rqO_2 var10 = new rqO_2("servers/" + Hashing.sha1().hashUnencodedChars(var2.id_break) + "/icon");
      this.id_class[2] = var10;
      fk_3 var11 = (fk_3)id_import.A().id_break((rqO_2)this.id_class[2]);
      this.id_class[3] = var11;
   }

   static {
      ntfClinit();
   }

   private static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, rqO_2 var5) {
      id_import.A().id_class(var5);
      RenderSystem.enableBlend();
      ch_3.id_class(var0, var1, var2, id_throws[10], id_throws[11], var3, var4, var3, var4);
      RenderSystem.disableBlend();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2134454388027434165L;
   }

   public boolean id_class(double var1, double var3, int var5) {
      if (((rruv_1)this.id_class[5]).id_break((float)var1, (float)var3) && var5 == 0) {
         id_import.id_break(new mt_3((vm_3)id_import.id_class[73], id_import, (Ak_1)this.id_class[1]));
         return true;
      } else {
         return id_case[2];
      }
   }

   public void id_class(rruv_1 var1) {
      this.id_class[5] = var1;
   }

   public boolean id_class(String var1) {
      if (var1 == null) {
         id_import.A().id_byte((rqO_2)this.id_class[2]);
         if ((fk_3)this.id_class[3] != null && ((fk_3)this.id_class[3]).id_break() != null) {
            ((fk_3)this.id_class[3]).id_break().close();
         }

         Object var7 = null;
         this.id_class[3] = var7;
      } else {
         try {
            fN_2 var2 = fN_2.id_class(var1);
            Validate.validState(var2.id_class() == 64 ? true : id_case[4], id_catch[0], new Object[id_case[5]]);
            Validate.validState(var2.id_break() == 64 ? true : id_case[7], id_catch[1], new Object[id_case[8]]);
            if ((fk_3)this.id_class[3] == null) {
               fk_3 var8 = new fk_3(var2);
               this.id_class[3] = var8;
            } else {
               ((fk_3)this.id_class[3]).id_class(var2);
               ((fk_3)this.id_class[3]).id_class();
            }

            id_import.A().id_class((rqO_2)this.id_class[2], (fk_3)this.id_class[3]);
         } catch (Throwable var9) {
            return id_case[9];
         }
      }

      return true;
   }

   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (!((Ak_1)this.id_class[1]).id_private) {
         ((Ak_1)this.id_class[1]).id_private = true;
         ((Ak_1)this.id_class[1]).id_throws = -2L;
         ((Ak_1)this.id_class[1]).id_protected = rgN_2.id_byte;
         ((Ak_1)this.id_class[1]).id_byte = rgN_2.id_byte;
         vF_2.id_class.submit(() -> {
            try {
               ((rrQC)this.id_class[id_private[49]]).id_final().id_class((Ak_1)this.id_class[1], () -> {
               });
            } catch (UnknownHostException var2x) {
               ((Ak_1)this.id_class[1]).id_throws = -1L;
               ((Ak_1)this.id_class[1]).id_protected = vF_2.id_catch;
            } catch (Exception var3x) {
               ((Ak_1)this.id_class[1]).id_throws = -1L;
               ((Ak_1)this.id_class[1]).id_protected = vF_2.id_private;
            }
         });
      }

      float var5 = ((rruv_1)this.id_class[5]).id_break();
      float var6 = ((rruv_1)this.id_class[5]).id_protected();
      float var7 = ((rruv_1)this.id_class[5]).id_byte();
      float var8 = ((rruv_1)this.id_class[5]).id_class();
      String var9 = ((Ak_1)this.id_class[1]).id_byte();
      if (!Objects.equals(var9, (String)this.id_class[4])) {
         if (this.id_class(var9)) {
            this.id_class[4] = var9;
         } else {
            ((Ak_1)this.id_class[1]).id_class(null);
         }
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      boolean var10 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[19]]).id_private().id_throws().id_super();
      if (var10 && (Ak_1)this.id_class[1] instanceof rrwA_2) {
         Object var16 = null;
         this.id_class[3] = var16;
      }

      if ((fk_3)this.id_class[3] != null) {
         id_class(var1, (int)var5, (int)var6, (int)var7, (int)var8, (rqO_2)this.id_class[2]);
      } else {
         id_class(var1, (int)var5, (int)var6, (int)var7, (int)var8, vF_2.id_throws);
      }

      if (((Qw_1)id_import.id_class[20]).S || ((rruv_1)this.id_class[5]).id_break((float)var2, (float)var3)) {
         id_import.A().id_class(vF_2.id_case);
         ch_3.id_class(var1, var5, var6, var5 + var7, var6 + var8, -1601138544);
         ch_3.id_class(var1, (int)var5 - 2, (int)var6, id_throws[8], 16.0F, (int)var7, (int)var8, 128, 128);
      }
   }

   public rruv_1 id_class() {
      return (rruv_1)this.id_class[5];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1964203141;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 72, 42, -87, 0, 95, 105, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.id_class[4];
   }

   public fk_3 id_throws() {
      return (fk_3)this.id_class[3];
   }

   private static void id_finally() {
      id_protected = new byte[]{2, 64, 64, 6};
   }

   private static void id_catch() {
      id_break = new int[]{-1601138544};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
      }
   }

   public rqO_2 id_case() {
      return (rqO_2)this.id_class[2];
   }

   private static void id_package() {
      id_byte = new long[]{-2L, -1L, -1L};
   }

   public Ak_1 id_protected() {
      return (Ak_1)this.id_class[1];
   }

   private static void id_final() {
      id_case = new boolean[]{true, true, false, true, false, false, true, false, false, false, true};
   }

   private static void id_volatile() {
      id_private = new short[]{
         5,
         0,
         1,
         2,
         2,
         3,
         1,
         1,
         1,
         1,
         1,
         5,
         5,
         5,
         5,
         1,
         4,
         4,
         1,
         0,
         1,
         3,
         3,
         2,
         20,
         5,
         128,
         128,
         5,
         73,
         1,
         5,
         2,
         3,
         3,
         3,
         3,
         3,
         3,
         3,
         3,
         2,
         3,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         1,
         1,
         1,
         1,
         1
      };
   }

   private static void id_native() {
      id_throws = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 16.0F, 0.0F, 0.0F};
   }
}
