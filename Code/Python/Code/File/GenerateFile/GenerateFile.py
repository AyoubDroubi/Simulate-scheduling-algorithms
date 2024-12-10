class WriterFile:

    def __init__(self):
        self.count = 0
        self.LinkFile = ""
        self.random = 0

    def create_file(self):
        raise NotImplementedError("Subclasses should implement this method.")
