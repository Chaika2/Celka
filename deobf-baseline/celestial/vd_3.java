package celestial;

public interface vd_3 {
   rqO_2 id_byte();

   void id_int();

   default boolean id_this() {
      return this.id_package() && !this.id_implements();
   }

   rgP_2 id_throws();

   rAZ id_catch();

   boolean id_extends();

   rgP_2 id_case();

   default rgP_2 id_continue() {
      return this.id_catch().decorate(this.id_case());
   }

   boolean id_implements();

   void id_new();

   boolean id_package();

   default boolean id_super() {
      return !this.id_package();
   }

   rAl_1 id_protected();

   boolean id_private();

   void id_final();

   boolean id_volatile();

   void id_native();
}
