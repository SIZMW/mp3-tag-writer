package mp3tagwriter;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class TagWindow extends javax.swing.JFrame {

    public TagWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TagInfoTab = new javax.swing.JTabbedPane();
        TagInfoPanel = new javax.swing.JPanel();
        FileLabel = new javax.swing.JLabel();
        FilePathTextField = new javax.swing.JTextField();
        FileNameTextField = new javax.swing.JTextField();
        TitleTextField = new javax.swing.JTextField();
        ArtistTextField = new javax.swing.JTextField();
        FeaturingTextField = new javax.swing.JTextField();
        AlbumTextField = new javax.swing.JTextField();
        AlbumArtistTextField = new javax.swing.JTextField();
        ComposerTextField = new javax.swing.JTextField();
        TrackNumberTextField = new javax.swing.JTextField();
        GenreTextField = new javax.swing.JTextField();
        YearTextField = new javax.swing.JTextField();
        FileNameLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ArtistLabel = new javax.swing.JLabel();
        FeaturingLabel = new javax.swing.JLabel();
        AlbumLabel = new javax.swing.JLabel();
        AlbumArtistLabel = new javax.swing.JLabel();
        ComposerLabel = new javax.swing.JLabel();
        TrackNumberLabel = new javax.swing.JLabel();
        GenreLabel = new javax.swing.JLabel();
        YearLabel = new javax.swing.JLabel();
        AlbumArtLabel = new javax.swing.JLabel();
        AlbumArtPane = new javax.swing.JPanel();
        TextCaseButton = new javax.swing.JButton();
        TitleFromFileButton = new javax.swing.JButton();
        AlbumArtButton = new javax.swing.JButton();
        CleanTagsButton = new javax.swing.JButton();
        FileListViewerPane = new javax.swing.JScrollPane();
        FileListViewer = new javax.swing.JList();
        ChooseFilesButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        ApplyButton = new javax.swing.JButton();
        TagCopyTab = new javax.swing.JPanel();
        CopyFromTextField = new javax.swing.JTextField();
        CopyToTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ChooseCopyFromFile = new javax.swing.JButton();
        ChooseCopyToFile = new javax.swing.JButton();
        CopyTagButton = new javax.swing.JButton();
        ClearCopyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3 Tagger");
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(640, 300));
        setResizable(false);

        FileLabel.setText("File Path:");

        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });

        TrackNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackNumberTextFieldActionPerformed(evt);
            }
        });

        FileNameLabel.setText("File Name:");

        TitleLabel.setText("Title:");

        ArtistLabel.setText("Artist:");

        FeaturingLabel.setText("Featuring:");

        AlbumLabel.setText("Album");

        AlbumArtistLabel.setText("Album Artist:");

        ComposerLabel.setText("Composer:");

        TrackNumberLabel.setText("Track Number:");

        GenreLabel.setText("Genre:");

        YearLabel.setText("Year:");

        AlbumArtLabel.setText("Album Art:");

        AlbumArtPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AlbumArtPane.setForeground(new java.awt.Color(240, 240, 240));
        AlbumArtPane.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout AlbumArtPaneLayout = new javax.swing.GroupLayout(AlbumArtPane);
        AlbumArtPane.setLayout(AlbumArtPaneLayout);
        AlbumArtPaneLayout.setHorizontalGroup(
            AlbumArtPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        AlbumArtPaneLayout.setVerticalGroup(
            AlbumArtPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        TextCaseButton.setText("Fix Text Case");
        TextCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCaseButtonActionPerformed(evt);
            }
        });

        TitleFromFileButton.setText("Title From File Name");
        TitleFromFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleFromFileButtonActionPerformed(evt);
            }
        });

        AlbumArtButton.setText("Add Album Art");
        AlbumArtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumArtButtonActionPerformed(evt);
            }
        });

        CleanTagsButton.setText("Clean Tags");
        CleanTagsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanTagsButtonActionPerformed(evt);
            }
        });

        FileListViewer.setModel(new DefaultListModel());
        FileListViewer.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                FileListViewerValueChanged(evt);
            }
        });
        FileListViewerPane.setViewportView(FileListViewer);

        ChooseFilesButton.setText("Choose Files...");
        ChooseFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFilesButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        ApplyButton.setText("Apply");
        ApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TagInfoPanelLayout = new javax.swing.GroupLayout(TagInfoPanel);
        TagInfoPanel.setLayout(TagInfoPanelLayout);
        TagInfoPanelLayout.setHorizontalGroup(
            TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TagInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TagInfoPanelLayout.createSequentialGroup()
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlbumArtLabel)
                            .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AlbumArtistLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FileNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ArtistLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FeaturingLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AlbumLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComposerLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TrackNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GenreLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(YearLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FileLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArtistTextField)
                            .addComponent(FeaturingTextField)
                            .addComponent(ComposerTextField)
                            .addComponent(AlbumArtistTextField)
                            .addComponent(TrackNumberTextField)
                            .addComponent(GenreTextField)
                            .addComponent(YearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AlbumTextField)
                            .addComponent(TitleTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FileNameTextField)
                            .addComponent(FilePathTextField)
                            .addGroup(TagInfoPanelLayout.createSequentialGroup()
                                .addComponent(AlbumArtPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(TagInfoPanelLayout.createSequentialGroup()
                        .addComponent(TextCaseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TitleFromFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlbumArtButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CleanTagsButton)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileListViewerPane, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TagInfoPanelLayout.createSequentialGroup()
                        .addComponent(ChooseFilesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApplyButton)))
                .addContainerGap())
        );
        TagInfoPanelLayout.setVerticalGroup(
            TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TagInfoPanelLayout.createSequentialGroup()
                .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TagInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FileLabel)
                            .addComponent(FilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FileNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FileNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ArtistTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArtistLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FeaturingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FeaturingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlbumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlbumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlbumArtistTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlbumArtistLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComposerLabel)
                            .addComponent(ComposerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(TrackNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GenreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(YearLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AlbumArtLabel))
                    .addGroup(TagInfoPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(TrackNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlbumArtPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FileListViewerPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TagInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCaseButton)
                    .addComponent(TitleFromFileButton)
                    .addComponent(AlbumArtButton)
                    .addComponent(CleanTagsButton)
                    .addComponent(ApplyButton)
                    .addComponent(ChooseFilesButton)
                    .addComponent(RemoveButton))
                .addGap(1, 1, 1))
        );

        TagInfoTab.addTab("Tag Info", TagInfoPanel);

        jLabel1.setText("Copy From:");

        jLabel2.setText("Copy To:");

        ChooseCopyFromFile.setText("Choose File...");

        ChooseCopyToFile.setText("Choose File...");

        CopyTagButton.setText("Copy");

        ClearCopyButton.setText("Clear");

        javax.swing.GroupLayout TagCopyTabLayout = new javax.swing.GroupLayout(TagCopyTab);
        TagCopyTab.setLayout(TagCopyTabLayout);
        TagCopyTabLayout.setHorizontalGroup(
            TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TagCopyTabLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(73, 73, 73)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CopyFromTextField)
                    .addComponent(CopyToTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChooseCopyFromFile)
                    .addComponent(ChooseCopyToFile))
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TagCopyTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearCopyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CopyTagButton)
                .addContainerGap())
        );
        TagCopyTabLayout.setVerticalGroup(
            TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TagCopyTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CopyFromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChooseCopyFromFile))
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CopyToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ChooseCopyToFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addGroup(TagCopyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CopyTagButton)
                    .addComponent(ClearCopyButton))
                .addContainerGap())
        );

        TagInfoTab.addTab("Copy Tags", TagCopyTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TagInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TagInfoTab, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyButtonActionPerformed

    }//GEN-LAST:event_ApplyButtonActionPerformed

    private void FileListViewerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_FileListViewerValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_FileListViewerValueChanged

    private void ChooseFilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFilesButtonActionPerformed

    }//GEN-LAST:event_ChooseFilesButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed

    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void TitleFromFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleFromFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleFromFileButtonActionPerformed

    private void AlbumArtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumArtButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlbumArtButtonActionPerformed

    private void TextCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCaseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCaseButtonActionPerformed

    private void CleanTagsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanTagsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CleanTagsButtonActionPerformed

    private void TrackNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrackNumberTextFieldActionPerformed

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed

    }//GEN-LAST:event_TitleTextFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TagWindow().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AlbumArtButton;
    public javax.swing.JLabel AlbumArtLabel;
    public javax.swing.JPanel AlbumArtPane;
    public javax.swing.JLabel AlbumArtistLabel;
    public javax.swing.JTextField AlbumArtistTextField;
    public javax.swing.JLabel AlbumLabel;
    public javax.swing.JTextField AlbumTextField;
    public javax.swing.JButton ApplyButton;
    public javax.swing.JLabel ArtistLabel;
    public javax.swing.JTextField ArtistTextField;
    public javax.swing.JButton ChooseCopyFromFile;
    public javax.swing.JButton ChooseCopyToFile;
    public javax.swing.JButton ChooseFilesButton;
    public javax.swing.JButton CleanTagsButton;
    public javax.swing.JButton ClearCopyButton;
    public javax.swing.JLabel ComposerLabel;
    public javax.swing.JTextField ComposerTextField;
    public javax.swing.JTextField CopyFromTextField;
    public javax.swing.JButton CopyTagButton;
    public javax.swing.JTextField CopyToTextField;
    public javax.swing.JLabel FeaturingLabel;
    public javax.swing.JTextField FeaturingTextField;
    public javax.swing.JLabel FileLabel;
    public javax.swing.JList FileListViewer;
    public javax.swing.JScrollPane FileListViewerPane;
    public javax.swing.JLabel FileNameLabel;
    public javax.swing.JTextField FileNameTextField;
    public javax.swing.JTextField FilePathTextField;
    public javax.swing.JLabel GenreLabel;
    public javax.swing.JTextField GenreTextField;
    public javax.swing.JButton RemoveButton;
    public javax.swing.JPanel TagCopyTab;
    public javax.swing.JPanel TagInfoPanel;
    public javax.swing.JTabbedPane TagInfoTab;
    public javax.swing.JButton TextCaseButton;
    public javax.swing.JButton TitleFromFileButton;
    public javax.swing.JLabel TitleLabel;
    public javax.swing.JTextField TitleTextField;
    public javax.swing.JLabel TrackNumberLabel;
    public javax.swing.JTextField TrackNumberTextField;
    public javax.swing.JLabel YearLabel;
    public javax.swing.JTextField YearTextField;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
