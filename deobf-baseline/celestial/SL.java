package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SL extends Pv_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_break;
   private static float[] id_throws;
   private static boolean[] id_case;

   public cd_3 id_byte() {
      this.id_package();
      return (cd_3)this.id_break[id_protected[33]];
   }

   private void id_int() {
      this.id_package();
      if ((UUID)this.id_break[id_protected[25]] != null) {
         ((cq_3)((Ps_1)this.id_class[id_protected[26]]).id_throws().id_class[id_protected[27]])
            .id_extends()
            .id_catch()
            .remove((UUID)this.id_break[id_protected[28]]);
         Object var5 = null;
         this.id_break[id_protected[29]] = var5;
         Object var6 = null;
         this.id_break[id_protected[30]] = var6;
      }
   }

   public SL(C_class var1) {
      super(var1);
      this.id_package();
      SA var6 = new SA(this);
      this.id_break[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new float[]{20.0F, 1.0F, 0.0F, 1.0F};
   }

   @Override
   public void id_class(rrAl_1 var1) {
      this.id_finally().ifPresent(var1x -> var1x.id_class(var1));
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_finally().ifPresent(var2 -> {
         this.id_package();
         if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[37]] && (Boolean)this.id_break[id_protected[38]]) {
            Integer var7 = (Integer)this.id_break[id_protected[39]] + id_case[9];
            this.id_break[id_protected[40]] = var7;
            this.id_final();
         }

         var2.id_class(var1);
      });
   }

   public void id_class(SC var1) {
      this.id_package();
      this.id_break[id_protected[21]] = var1;
      this.id_finally().ifPresent(var1x -> var1x.id_class(var1));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 470673797;
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_finally().ifPresent(var1x -> var1x.id_class(var1));
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_finally().ifPresent(var1x -> var1x.id_class(var1));
   }

   public void id_class() {
      this.id_package();
      if ((SC)this.id_break[id_protected[15]] != null) {
         this.id_int();
         UUID var5 = UUID.randomUUID();
         this.id_break[id_protected[16]] = var5;
         Boolean var6 = id_case[4];
         this.id_break[id_protected[17]] = var6;
         this.id_final();
      }
   }

   @Override
   public void id_class(rrLO var1) {
      this.id_finally().ifPresent(var1x -> var1x.id_class(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8166423336542917410L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 44, 34, 79, 18, -26, 15, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break() {
      this.id_package();
      Object var5 = null;
      this.id_break[id_protected[22]] = var5;
      this.id_int();
      Integer var6 = Integer.valueOf(id_case[7]);
      this.id_break[id_protected[23]] = var6;
      Boolean var7 = id_case[8];
      this.id_break[id_protected[24]] = var7;
   }

   public boolean id_throws() {
      this.id_package();
      return (SC)this.id_break[id_protected[19]] != null && !rql_3.id_break(((SC)this.id_break[id_protected[20]]).id_byte()) ? id_case[5] : id_case[6];
   }

   private Optional<Sv_1> id_finally() {
      this.id_package();
      return !this.id_throws() ? Optional.empty() : ((SA)this.id_break[id_protected[18]]).id_class();
   }

   public SC id_catch() {
      this.id_package();
      return (SC)this.id_break[id_protected[31]];
   }

   private static void id_extends() {
      id_byte = new byte[]{6, 4, 5};
   }

   public boolean id_case() {
      this.id_package();
      return (Boolean)this.id_break[id_protected[36]];
   }

   private static void id_continue() {
      id_protected = new short[]{1, 0, 3, 0, 4, 4, 4, 2, 3, 2, 2, 1, 19, 3, 2, 0, 3, 5, 1, 0, 0, 0, 0, 4, 5, 3, 1, 19, 3, 3, 2, 0, 1, 2, 3, 4, 5, 0, 5, 4, 4};
   }

   public int id_implements() {
      this.id_package();
      return (Integer)this.id_break[id_protected[35]];
   }

   private static void id_new() {
      id_case = new boolean[]{false, false, false, true, true, true, false, false, false, true, false, false};
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
         var1[id_byte[1]] = Integer.valueOf(id_case[10]);
         var1[id_byte[2]] = id_case[11];
      }
   }

   private boolean id_super() {
      return id_case[3];
   }

   public SA id_protected() {
      this.id_package();
      return (SA)this.id_break[id_protected[32]];
   }

   public UUID id_private() {
      this.id_package();
      return (UUID)this.id_break[id_protected[34]];
   }

   private void id_final() {
      this.id_package();
      if ((SC)this.id_break[id_protected[1]] != null && (UUID)this.id_break[id_protected[2]] != null) {
         int var1 = ((SC)this.id_break[id_protected[3]]).id_break();
         if (var1 > 0) {
            if ((Integer)this.id_break[id_protected[4]] >= var1) {
               this.id_int();
            } else {
               int var2 = var1 - (Integer)this.id_break[id_protected[5]];
               float var3 = (float)var2 / id_throws[0];
               float var4 = id_throws[1]
                  - rfU_2.id_class((float)((Integer)this.id_break[id_protected[6]]).intValue() / (float)var1, id_throws[2], id_throws[3]);
               if ((cd_3)this.id_break[id_protected[7]] != null && !this.id_super()) {
                  ((cd_3)this.id_break[id_protected[10]]).id_class(var4);
               } else {
                  rgN_2 var5 = new rgN_2("Перезаход через " + rgF_2.RED + rql_3.id_class(var3) + " сек.");
                  cd_3 var10 = new cd_3((UUID)this.id_break[id_protected[8]], var5, rRb_1.WHITE, rRM.PROGRESS, var4, id_case[0], id_case[1], id_case[2]);
                  this.id_break[id_protected[9]] = var10;
               }

               ((cq_3)((Ps_1)this.id_class[id_protected[11]]).id_throws().id_class[id_protected[12]])
                  .id_extends()
                  .id_catch()
                  .put((UUID)this.id_break[id_protected[13]], (cd_3)this.id_break[id_protected[14]]);
            }
         }
      }
   }
}
