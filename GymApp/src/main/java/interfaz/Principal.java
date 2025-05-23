/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import bbdd.DAOCarritos;
import bbdd.DAOProductos;
import entidades.Producto;
import entidades.Usuario;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.util.List;

/**
 *
 * @author usuarioDAW
 */
public class Principal extends javax.swing.JFrame {

    private Usuario usuario;
    private List<Producto> productos = new ArrayList<>();
    private DAOProductos daoProductos = new DAOProductos();

    /**
     * Creates new form Principal
     */
    public Principal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        productos = daoProductos.listarProductos();
        System.out.println(productos);
        cargarProducto();
        buscarpanel.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                buscarProductos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarProductos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarProductos();
            }
        });

        setLocationRelativeTo(null);
        etiquetaUsuario.setText("Bienvenido " + usuario.getNombre());
        panelproducto.setLayout(new GridLayout(0, 5, 10, 10));
        buscarProductos();
        System.out.println("Total productos encontrados: " + productos.size());
        productos.forEach(p -> System.out.println(p.getNombre() + " - " + p.getCategoria()));
    }

    public Principal() {
        this(null);
    }

    private void cargarProducto() {
        panelproducto.removeAll();
        for (Producto producto : productos) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setPreferredSize(new Dimension(150, 200));

            URL location = getClass().getResource("/img/" + producto.getNombre() + ".jpg");
            ImageIcon imagen;
            if (location != null) {
                imagen = new ImageIcon(location);
            } else {
                System.err.println("Imagen no encontrada para: " + producto.getNombre());
                imagen = new ImageIcon(); // Imagen por defecto o vacía
            }
            Image imgproducto = imagen.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
            JLabel Imagen = new JLabel(new ImageIcon(imgproducto));
            Imagen.setPreferredSize(new Dimension(120, 100));
            Imagen.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel Nombre = new JLabel(producto.getNombre(), SwingConstants.CENTER);
            JLabel Precio = new JLabel(String.format("%.2f €", producto.getPrecio(), SwingConstants.CENTER));
            Nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
            Precio.setAlignmentX(Component.CENTER_ALIGNMENT);

            JButton añadirCarrito = new JButton("Añadir al carrito");
            añadirCarrito.setAlignmentX(CENTER_ALIGNMENT);

            añadirCarrito.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DAOCarritos daoCarrito = new DAOCarritos();
                    int idUsuario = usuario.getId();
                    int idProducto = producto.getId();

                    if (daoCarrito.productoEnCarrito(idUsuario, idProducto)) {
                        daoCarrito.agregarProductoExistente(idUsuario, idProducto);
                    } else {
                        daoCarrito.agregarNuevoProducto(idUsuario, idProducto);
                    }

                    JOptionPane.showMessageDialog(null, producto.getNombre() + " añadido al carrito.");
                }
            });

            panel.add(Imagen);
            panel.add(Nombre);
            panel.add(Precio);
            panel.add(añadirCarrito);

            panelproducto.add(panel);
        }
        panelproducto.revalidate();
        panelproducto.repaint();
    }

    private void buscarProductos() {
        String textoBusqueda = buscarpanel.getText().trim().toLowerCase();
        panelproducto.removeAll();

        for (Producto producto : productos) {
            if (producto.getNombre().toLowerCase().contains(textoBusqueda)) {
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setPreferredSize(new Dimension(150, 200));

                URL location = getClass().getResource("/img/" + producto.getNombre() + ".jpg");
                ImageIcon imagen;
                if (location != null) {
                    imagen = new ImageIcon(location);
                } else {
                    System.err.println("Imagen no encontrada para: " + producto.getNombre());
                    imagen = new ImageIcon(); // Imagen por defecto o vacía
                }
                Image imgproducto = imagen.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                JLabel Imagen = new JLabel(new ImageIcon(imgproducto));
                Imagen.setPreferredSize(new Dimension(120, 100));
                Imagen.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel Nombre = new JLabel(producto.getNombre(), SwingConstants.CENTER);
                JLabel Precio = new JLabel(String.format("%.2f €", producto.getPrecio(), SwingConstants.CENTER));
                Nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
                Precio.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton añadirCarrito = new JButton("Añadir al carrito");
                añadirCarrito.setAlignmentX(CENTER_ALIGNMENT);
                añadirCarrito.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DAOCarritos daoCarrito = new DAOCarritos();
                        int idUsuario = usuario.getId();
                        int idProducto = producto.getId();

                        if (daoCarrito.productoEnCarrito(idUsuario, idProducto)) {
                            daoCarrito.agregarProductoExistente(idUsuario, idProducto);
                        } else {
                            daoCarrito.agregarNuevoProducto(idUsuario, idProducto);
                        }

                        JOptionPane.showMessageDialog(null, producto.getNombre() + " añadido al carrito.");
                    }
                });

                panel.add(Imagen);
                panel.add(Nombre);
                panel.add(Precio);
                panel.add(añadirCarrito);

                panelproducto.add(panel);

            }
        }

        panelproducto.revalidate();
        panelproducto.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textogymapp = new javax.swing.JLabel();
        buscartexto = new javax.swing.JLabel();
        buscarpanel = new javax.swing.JTextField();
        panelScroll = new javax.swing.JScrollPane();
        panelproducto = new javax.swing.JPanel();
        cerrarsesion = new javax.swing.JButton();
        carrito = new javax.swing.JButton();
        pedidos = new javax.swing.JButton();
        etiquetaUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textogymapp.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        textogymapp.setText("GymApp");

        buscartexto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscartexto.setText("Buscar");

        buscarpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpanelActionPerformed(evt);
            }
        });

        panelproducto.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelproductoLayout = new javax.swing.GroupLayout(panelproducto);
        panelproducto.setLayout(panelproductoLayout);
        panelproductoLayout.setHorizontalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        panelproductoLayout.setVerticalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        panelScroll.setViewportView(panelproducto);

        cerrarsesion.setBackground(new java.awt.Color(102, 102, 102));
        cerrarsesion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cerrarsesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarsesion.setText("Cerrar Sesión");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });

        carrito.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        carrito.setText("Carrito");
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });

        pedidos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pedidos.setText("Pedidos");
        pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosActionPerformed(evt);
            }
        });

        etiquetaUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        etiquetaUsuario.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscartexto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textogymapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(carrito))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cerrarsesion)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pedidos)
                            .addComponent(buscartexto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textogymapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(etiquetaUsuario)))
                .addGap(18, 18, 18)
                .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        VentanaCarrito carrito = new VentanaCarrito(usuario);
        carrito.setSize(550, 540);
        carrito.setLocationRelativeTo(null);
        carrito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        carrito.setVisible(true);
    }//GEN-LAST:event_carritoActionPerformed

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        Login login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosActionPerformed
        Pedidos pedidos = new Pedidos(usuario);
        pedidos.setSize(550, 540);
        pedidos.setLocationRelativeTo(null);
        pedidos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pedidos.setVisible(true);
    }//GEN-LAST:event_pedidosActionPerformed

    private void buscarpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpanelActionPerformed

    }//GEN-LAST:event_buscarpanelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarpanel;
    private javax.swing.JLabel buscartexto;
    private javax.swing.JButton carrito;
    private javax.swing.JButton cerrarsesion;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JPanel panelproducto;
    private javax.swing.JButton pedidos;
    private javax.swing.JLabel textogymapp;
    // End of variables declaration//GEN-END:variables
}
