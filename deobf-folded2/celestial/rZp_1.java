package celestial;

import java.io.IOException;

public class rZp_1 implements ruS_2<rmH_2> {
   private rfH_2 id_class;
   private ryM_2 id_break;
   private rCD id_byte;
   private String id_protected;
   private rfH_2 id_throws;
   private rfH_2 id_case;
   private rpa_3 id_catch;
   private rqd_3 id_private;
   private String id_implements;
   private boolean id_finally;
   private boolean id_extends;
   private boolean id_native;
   private float id_volatile;
   private long id_final;

   public ryM_2 id_byte() {
      return this.id_break;
   }

   public rZp_1() {
   }

   public rZp_1(
      rfH_2 var1,
      ryM_2 var2,
      rCD var3,
      String var4,
      rfH_2 var5,
      rfH_2 var6,
      rpa_3 var7,
      rqd_3 var8,
      String var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      long var14
   ) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = var11;
      this.id_native = var12;
      this.id_volatile = var13;
      this.id_final = var14;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_byte();
      this.id_break = var1.id_class(ryM_2.class);
      this.id_byte = var1.id_class(rCD.class);
      this.id_protected = var1.id_throws(32767);
      byte var2 = 48;
      this.id_throws = new rfH_2(rfU_2.id_class(var1.readByte(), -48, 48), rfU_2.id_class(var1.readByte(), -48, 48), rfU_2.id_class(var1.readByte(), -48, 48));
      byte var3 = 48;
      this.id_case = new rfH_2(rfU_2.id_class(var1.readByte(), 0, 48), rfU_2.id_class(var1.readByte(), 0, 48), rfU_2.id_class(var1.readByte(), 0, 48));
      this.id_catch = var1.id_class(rpa_3.class);
      this.id_private = var1.id_class(rqd_3.class);
      this.id_implements = var1.id_throws(12);
      this.id_volatile = rfU_2.id_class(var1.readFloat(), 0.0F, 1.0F);
      this.id_final = var1.id_catch();
      byte var4 = var1.readByte();
      this.id_finally = (var4 & 1) != 0;
      this.id_extends = (var4 & 2) != 0;
      this.id_native = (var4 & 4) != 0;
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_byte);
      var1.id_class(this.id_protected);
      var1.writeByte(this.id_throws.b_());
      var1.writeByte(this.id_throws.c_());
      var1.writeByte(this.id_throws.d_());
      var1.writeByte(this.id_case.b_());
      var1.writeByte(this.id_case.c_());
      var1.writeByte(this.id_case.d_());
      var1.id_class(this.id_catch);
      var1.id_class(this.id_private);
      var1.id_class(this.id_implements);
      var1.writeFloat(this.id_volatile);
      var1.id_class(this.id_final);
      byte var2 = 0;
      if (this.id_finally) {
         var2 |= 1;
      }

      if (this.id_extends) {
         var2 |= 2;
      }

      if (this.id_native) {
         var2 |= 4;
      }

      var1.writeByte(var2);
   }

   public String id_throws() {
      return this.id_protected;
   }

   public String id_finally() {
      return this.id_implements;
   }

   public rfH_2 id_catch() {
      return this.id_case;
   }

   public boolean id_extends() {
      return this.id_finally;
   }

   public rfH_2 id_case() {
      return this.id_throws;
   }

   public rqd_3 id_implements() {
      return this.id_private;
   }

   public long id_package() {
      return this.id_final;
   }

   public rCD id_protected() {
      return this.id_byte;
   }

   public rpa_3 id_private() {
      return this.id_catch;
   }

   public float id_final() {
      return this.id_volatile;
   }

   public boolean id_volatile() {
      return this.id_native;
   }

   public boolean id_native() {
      return this.id_extends;
   }
}
